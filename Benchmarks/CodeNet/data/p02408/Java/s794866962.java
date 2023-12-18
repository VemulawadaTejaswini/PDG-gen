import sys

def make_all_cards():
    mark = ['S', 'H', 'C', 'D']
    cards = []
    
    for i in mark:
        for n in range(1, 14):
            cards.append(i + ' ' + str(n))

    return cards

if __name__ == '__main__':
    all_cards = make_all_cards()
    n = int(sys.stdin.readline().strip())

    for _ in range(n):
        card = sys.stdin.readline().strip()
        all_cards.remove(card)

    for i in all_cards:
        print(i)
