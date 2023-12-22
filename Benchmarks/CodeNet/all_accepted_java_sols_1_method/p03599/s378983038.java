import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        ArrayList<Integer> listx = new ArrayList<>();
        ArrayList<Integer> listy = new ArrayList<>();

        for(int i=0; i<=40; i++){
            for(int j=0; j<=40; j++){
                int x = A * 100 * i + B * 100 * j;
                if(x>F){
                    break;
                }
                else{
                    listx.add(x);
                }
            }
        }

        for(int i=0; i<=4000; i++){
            for(int j=0; j<=4000; j++){
                int y = C * i + D * j;
                if(y>F){
                    break;
                }
                else{
                    listy.add(y);
                }
            }
        }

        double max = 0;
        int ansx = 0;
        int ansy = 0;
        for(int i=0; i<listx.size(); i++){
            for(int j=0; j<listy.size(); j++){
                int x = listx.get(i);
                int y = listy.get(j);
                if((double)y/x<=E/100.0 && x+y<=F){
                    max = Math.max(max, y * 100.0 / (x + y));
                    if(max==y*100.0/(x+y)){
                        ansx = x + y;
                        ansy = y;
                    }
                }
            }
        }
        System.out.println(ansx + " " + ansy);
    }
}