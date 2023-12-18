//
//  main.cpp
//  AizuOnline
//
//  Created by ?????¬ ?????? on 19/05/2016.
//  Copyright ?? 2016 ?????¬ ??????. All rights reserved.
//

#include <iostream>

int main(int argc, const char * argv[]) {
    int a = 0;
    int b = 0;
    int ab = 0;
    int o = 0;
    int k;
    char s[5];
    
    while (scanf("%d,%s",&k,s)!= EOF){
        if(s[0] == 'A' && s[1] == 'B'){
            ab = ab + 1;
        }else if(s[0] == 'A'){
            a++;
        }else if(s[0] == 'B'){
            b++;
        }else if(s[0] == 'O'){
            o++;
        }
        
         std::cout << a << std::endl;
        std::cout << b << std::endl;
        std::cout << ab << std::endl;
        std::cout << o << std::endl;
        
    }
    
        }