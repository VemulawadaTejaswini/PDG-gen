#include <math.h>
#include <utility>
#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;
 
int m;
int n;
int map[10][10] = {0};
int cnt = 0;
int churchx;
int churchy;
int dx[4] = {-1,1,0,0};
int dy[4] = {0,0,-1,1};
 
int saiki( int xinput, int yinput, int nokori ) {
    for ( int i = 0; i < 4; i++ ) {
        int x = xinput;
        int y = yinput;
        if ( nokori == 0 ) {
            if ( y == churchy && x > churchx && i != 0 ) continue;
            if ( y == churchy && x < churchx && i != 1 ) continue;
            if ( x == churchx && y > churchy && i != 2 ) continue;
            if ( x == churchx && y < churchy && i != 3 ) continue;
        }
	
        while(true) {
            x += dx[i];
            y += dy[i];
            if ( x < 0 || x >= m || y < 0 || y >= n ) break;
            
	    if (map[x][y] == 1){
                map[x][y] = 3;
                saiki(x, y, nokori-1);
                map[x][y] = 1;
		break;
            }else if(map[x][y] == 2 ){
                if(nokori == 0){
                    cnt++;
                    return 0;
                }
            }
        }
    }
    return 0;
}
 
int main(){
    while(true) {
        cin >> m;
        cin >> n;
        if ( m == 0 ) break;
        int nokori = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                cin >> map[j][i];
		//unvisited
                if ( map[j][i] == 1 ) {
                    nokori++;
		    
		//is_church
                }else if(map[j][i] == 2) {
                    churchx = j;
                    churchy = i;
                }
            }
        }
	
	cnt = 0;
	saiki( churchx, churchy, nokori );
	cout << cnt << endl;
    
    }
    return 0;
}