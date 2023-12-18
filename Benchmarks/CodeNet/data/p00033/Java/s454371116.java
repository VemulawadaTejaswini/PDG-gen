import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args)
            throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        int [] ball =new  int [10];
int n=scan.nextInt();
            for(int j=0;j<n;j++){
                for(int i=0;i<10;i++)ball[i] = scan.nextInt();
                boolean flag =true;
                Stack <Integer> b =new Stack <Integer>();
                Stack <Integer> c =new Stack<Integer>();
b.push(0);
c.push(0);
                int i;
                for(i=0;i<10;i++){
                    if(b.peek() > ball[i]){
                        if(c.peek()>ball[i]){
                            System.out.println("NO");
                            flag = false;
                            break;
                        }
                        else {c.push(ball[i]);}
                    }

                    else {
                        if(c.peek() > ball[i]){
                            b.push(ball[i]);}
                        else {
                                   if(ball[i]-b.peek()<=ball[i]-c.peek()){
                                             b.push(ball[i]);}
else{c.push(ball[i]);}
}
}
}if(flag)System.out.println("YES");
}
}
}