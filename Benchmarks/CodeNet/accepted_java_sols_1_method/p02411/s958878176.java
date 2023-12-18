import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int mid_exam=sc.nextInt();
            int final_exam=sc.nextInt();
            int re_exam=sc.nextInt();
            if(mid_exam==-1 && final_exam==-1 && re_exam == -1) break;
            if(mid_exam==-1 || final_exam ==-1){
                System.out.println("F");
            }
            else if(mid_exam+final_exam>=80){
                 System.out.println("A");
            }
            else if(mid_exam+final_exam>=65){
                 System.out.println("B");
            }
            else if(mid_exam+final_exam>=50){
                 System.out.println("C");
            }
            else if(mid_exam+final_exam>=30 )
                 {
                   if(re_exam>=50) System.out.println("C");  
                  else System.out.println("D");
                 }
            else System.out.println("F");
        }
        
    }
}
