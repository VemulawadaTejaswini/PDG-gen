import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception   {
       Scanner sc = new Scanner(System.in);
       int flag=0;
       while(sc.hasNext()){
           String s = sc.next();
           char [] A =  s.toCharArray();
           int no=0;
           int count=0;
           int kind=0;
           for(int i=0; A[i]!='.' && no==0 ;i++){
                if(A[i]=='('){
                    count+=1;
                    kind=1;
                }
                if(A[i]=='['){
                    count+=2;
                    kind=2;
                }
                
                if(A[i]==')'){
                    if(kind==1) count-=1;
                    else {
                        System.out.println("no");
                        no=1;
                    }
                }
                if(A[i]==']'){
                    if(kind==2) count-=2;
                    else {
                        System.out.println("no");
                        no=1;
                    } 
                }
                
                if(count==0) System.out.println("yes");
                else System.out.println("no");
           }
           
       }
    }
}

