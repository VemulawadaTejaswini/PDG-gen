import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        long B=sc.nextLong();
        long C=sc.nextLong();
        long count=0;
        long a,b,c;
        while(((A%2)==0) && ((B%2)==0) && ((C%2)==0)){
            if((A==B) && (B==C)){
                count=-1;
                break;
            }
            a=A;
            b=B;
            c=C;
            A=(b+c)/2;
            B=(a+c)/2;
            C=(a+b)/2;
            count+=1;
        }
        System.out.println(count);
    }
}

