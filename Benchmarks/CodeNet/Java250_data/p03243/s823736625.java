import java.io.*;
import java.util.*;
class Program{
    int solve(int i, int size){
        int temp = i;
        for(int j=1;j<size;j++){
            temp=temp*10+i;
        }
        return temp;
    }
}
class Main{
    public static void main(String[] args) {
        Program obj = new Program();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<=9;i++){
            if(obj.solve(i,String.valueOf(N).length())>=N) {System.out.println(obj.solve(i,String.valueOf(N).length())); break;}
            //System.out.println(obj.solve(i,String.valueOf(N).length()));
        }
    }
}