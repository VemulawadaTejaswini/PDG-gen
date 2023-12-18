#include <iostream>
#include <cstring>
#include <queue>

#define SIZE (8)
#define ANSWER_STATE_CODE (342391)
#define STATE_SIZE (16434824+1-ANSWER_STATE_CODE)

int coefficients[SIZE] = {2097152, 262144, 32768, 4096, 512, 64, 8, 1};


int movablePairs[SIZE][4] = {
    {1,4,-1,-1}, {0,2,5,-1}, {1,3,6,-1}, {2,7,-1,-1},
    {0,5,-1,-1}, {1,4,6,-1}, {2,5,7,-1}, {3,6,-1,-1}
};

bool isVisit[STATE_SIZE];

typedef struct {
    short state[SIZE];
    int depth;
    int movablePiecePoint;
    int stateCode;
} puzzle;

void move(short state[], short nextState[], int point1, int point2)
{
    memcpy(nextState, state, sizeof(short)*SIZE);
    short tmp = nextState[point1];
    nextState[point1] = nextState[point2];
    nextState[point2] = tmp;
    return;
}

int puzzleInit(puzzle *p)
{
    short movablePieceNum = 0;
    int tmpStateCode = -ANSWER_STATE_CODE;
    int tmpMovablePiecePoint = -1;
    for (int i=0; i<SIZE; i++) {
        if(movablePieceNum == (*p).state[i]){
            tmpMovablePiecePoint = i;
        }
        tmpStateCode += coefficients[i]*(int)(*p).state[i];
    }
    (*p).stateCode = tmpStateCode;
    (*p).movablePiecePoint = tmpMovablePiecePoint;
    return 0;
}

int solve(short input[])
{
    std::queue<puzzle> qu;
    for (int i=0; i<STATE_SIZE; i++) {
        isVisit[i] = false;
    }
    
    puzzle init;
    memcpy(init.state, input, sizeof(short)*SIZE);
    init.depth = 0;
    puzzleInit(&init);
    
    qu.push(init);
    while (!qu.empty()) {
        puzzle now = qu.front();
        qu.pop();
        if (0 == now.stateCode) {
            return now.depth;
        }
        
        if (!isVisit[now.stateCode]) {
            for (int i=0; movablePairs[now.movablePiecePoint][i]>=0; i++){
                int nextMove = movablePairs[now.movablePiecePoint][i];
                puzzle nextP;
                move(now.state, nextP.state, now.movablePiecePoint, nextMove);
                nextP.depth = now.depth+1;
                puzzleInit(&nextP);

                qu.push(nextP);
            }
            isVisit[now.stateCode] = true;
        }
    }
    return -1;
}

int main(int argc, const char * argv[])
{
    while (true) {
        short input[SIZE];
        for(int i=0; i<SIZE; i++){
            std::cin >> input[i];
        }
        int count = solve(input);
        std::cout << count<< std::endl;
    }
    
    return 0;
}