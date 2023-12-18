import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args)  {
         Scanner sc = new Scanner(System.in);
    int dice[] = new int[6];
    int right = 0; 
     
    for(int i=0; i<6; i++){
        dice[i] = sc.nextInt();
        }
         
    int q  = sc.nextInt();
     
    for(int i =0; i<q; i++){
        int top = sc.nextInt(); 
        int front = sc.nextInt();
 
        if(top == dice[0]){
           if(front == dice[1]){
               right = dice[2];
           }
           else if(front == dice[2]){
               right = dice[4];
           }
           else if(front == dice[4]){
               right = dice[3];
           }
           else if(front == dice[3]){
               right = dice[1];
           }
        }
        else if(top == dice[1]){
           if(front == dice[5]){
               right = dice[2];
           }
           else if(front == dice[2]){
               right = dice[0];
           }
           else if(front == dice[0]){
               right = dice[3];
           }
           else if(front == dice[3]){
               right = dice[5];
           }
        }
        else if(top == dice[2]){
            if(front == dice[5]){
                right = dice[4];
            }
            else if(front == dice[4]){
                right = dice[0];
            }
            else if(front == dice[0]){
                right = dice[1];
            }
            else if(front == dice[1]){
                right = dice[5];
            }
        }
        else if(top == dice[3]){
            if(front == dice[0]){
                right = dice[4];
            }
            else if(front == dice[4]){
                right = dice[5];
            }
            else if(front == dice[5]){
                right = dice[1];
            }
            else if(front == dice[1]){
                right = dice[0];
            }
        }
        else if(top == dice[4]){
            if(front == dice[0]){
                right = dice[2];
            }
            else if(front == dice[2]){
                right = dice[5];
            }
            else if(front == dice[5]){
                right = dice[3];
            }
            else if(front == dice[3]){
                right = dice[0];
            }
        }
        else if(top == dice[5]){
            if(front == dice[3]){
                right = dice[4];
            }
            else if(front == dice[4]){
                right = dice[2];
            }
            else if(front ==dice[2]){
                right = dice[1];
            }
            else if(front == dice[1]){
                right = dice[3];
            }
        
        }
     System.out.println(right);
 
    }
 
   }
}