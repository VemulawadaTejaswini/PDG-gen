#include <iostream>

int main(int argc, const char * argv[]) {
    int k;
    int out = 0;
    int hit = 0;
    int numrun = 0;
    int pointa = 0;
    int pointb = 0;
    int ining = 0;
    
    std::cin >> ining;
    int i = 1;
    while(i < ining + 1){
        std::string judge;
        std::cin >> judge;
        
        if(judge == "HIT"){
            hit++;
            if(hit == 4){
                pointa++;
                hit = hit - 1;
            }
        }
        
        if(judge == "OUT"){
            out++;
            if(out >= 3){
                i++;
                std::cout << pointa << std::endl;
                hit = 0;
                out = 0;
                pointa = 0;
            }
        }
        
        if(judge == "HOMERUN"){
            pointa = pointa + hit + 1;
            hit = 0;
        }
  }
}