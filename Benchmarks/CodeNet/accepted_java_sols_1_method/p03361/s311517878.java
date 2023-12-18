import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int H = sc.nextInt();
                int W = sc.nextInt();
                String[] grid = new String[H+2];
                for(int i=1; i<=H; i++){
                        grid[i] = sc.next();
                        grid[i] = "." + grid[i] + ".";
                }
                grid[0] = ".";
                grid[H+1] = ".";
                for(int j=1; j<=W+1; j++){
                        grid[0] += ".";
                        grid[H+1] += ".";
                }
/*
                for(int i=0; i<=H+1; i++){
                        for(int j=0; j<=W+1; j++){
                                System.out.print(grid[i].charAt(j));
                        }
                        System.out.println("");
                }
*/
                boolean ch = true;

                for(int i=1; i<=H; i++){
                        for(int j=1; j<=W; j++){
                                if(grid[i].charAt(j) == '#'){
                                        if( (grid[i].charAt(j-1) == '.' && grid[i].charAt(j+1) == '.')
                                        && (grid[i-1].charAt(j) == '.' && grid[i+1].charAt(j) == '.') ){
                                        ch=false;
                                        break;
                                        }
                                }

                        }
                        if(!ch)break;
                }

                if(ch){
                        System.out.println("Yes");
                }else{
                        System.out.println("No");
                }
        }
}
