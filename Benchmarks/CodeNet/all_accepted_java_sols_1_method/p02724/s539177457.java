import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc  = new Scanner(System.in);
int x = sc.nextInt();
int result =0;
int div=0;

   div = x/500;
    result = div*2*500;



x = x-(div*500);


result+= x;

if(x%5!=0){
result=result- (x%5);


}
System.out.println(result);
}

}