import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int res;

        if(360%N==0){
            res = 360/N;
        }else{
            res = 360;
            if(N%2==0){
                res = 180;
                if(N%4==0){
                    res = 90;
                    if(N%8==0){
                        res = 45;
                    }
                }
            }
            if(N%3==0){
                res = res/3;
                if(N%9==0){
                    res = res/3;
                }
            }
            if(N%5==0){
                res = res/5;
            }
        }
        

        
        
        System.out.println(res);
        
        }
    }