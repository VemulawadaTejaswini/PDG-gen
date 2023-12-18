#include <queue>
#include <vector>
#include <string>
#include <cassert>
#include <iostream>
#include <algorithm>
 
enum class Direction
{
    North = 0,
    East,
    South,
    West,
};
 
struct Number
{
    Number(int t, int f, int r, int l, int b, int btm)
        :top(t), front(f), right(r), left(l), back(b), bottom(btm) {}
 
    int top;
    int front;
    int right;
    int left;
    int back;
    int bottom;
};
 
bool operator==(const Number &lhs, const Number &rhs)
{
    return
        lhs.top == rhs.top &&
        lhs.front == rhs.front &&
        lhs.right == rhs.right &&
        lhs.left == rhs.left &&
        lhs.back == rhs.back &&
        lhs.bottom == rhs.bottom;
}
 
class Dice
{
    public:
        explicit Dice(const Number &number) :number_(number) {}
 
        Dice rotate_to(Direction direction) const
        {
            const Number number = [&](Direction direction) {
                switch(direction)
                {
                    default:
                        assert(!"Invalid Direction.");
                    case Direction::North:
                        return Number(number_.front, number_.bottom, number_.right, number_.left, number_.top, number_.back);
                    case Direction::East:
                        return Number(number_.left, number_.front, number_.top, number_.bottom, number_.back, number_.right);
                    case Direction::South:
                        return Number(number_.back, number_.top, number_.right, number_.left, number_.bottom, number_.front);
                    case Direction::West:
                        return Number(number_.right, number_.front, number_.bottom, number_.top, number_.back, number_.left);
                }
            }(direction);
            return Dice(number);
        }
 
        Number number() const { return number_; }
 
    private:
        Number number_;
};
 
bool operator==(const Dice &lhs, const Dice &rhs)
{
    return lhs.number() == rhs.number();
}
 
Dice make_dice()
{
    int top, front, right, left, back, bottom;
    std::cin >> top >> front >> right >> left >> back >> bottom;
    Number number(top, front, right, left, back, bottom);
    Dice dice(number);
    return dice;
}
 
bool exist(const Dice & dice, const std::vector<Dice> &memo)
{
    return std::find(memo.begin(), memo.end(), dice) != memo.end();
}
 
int solve_core(std::queue<Dice> &dices, std::vector<Dice> &memo, int top, int front)
{
    const std::vector<Direction> directions = { Direction::North, Direction::East, Direction::South, Direction::West };
    while(true)
    {
        for(const auto &direction : directions)
        {
            const auto dice = dices.front().rotate_to(direction);
            const auto number = dice.number();
            if(number.top == top && number.front == front)
            {
                return number.right;
            }
            if(exist(dice, memo))
            {
                continue;
            }
            dices.push(dice);
        }
        dices.pop();
    }
}
 
std::vector<int> solve()
{
    const auto dice = make_dice();
    int questions;
    std::cin >> questions;
    std::vector<int> ans;
    for(int i = 0; i < questions; ++i)
    {
        int top, front;
        std::cin >> top >> front;
        std::vector<Dice> memo = { dice };
        std::queue<Dice> dices; dices.push(dice);
        ans.push_back(solve_core(dices, memo, top, front));
    }
    return ans;
}
 
int main()
{
    const auto ans = solve();
    for(const auto &e : ans)
    {
        std::cout << e << std::endl;
    }
    return 0;
}