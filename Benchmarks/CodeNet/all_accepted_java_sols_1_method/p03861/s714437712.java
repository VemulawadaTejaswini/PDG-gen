import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
long a = sc.nextLong();
long b = sc.nextLong();
long x = sc.nextLong();
long ax;
if(a != 0){
ax = ((a -1) / x )+ 1;
}else{
ax = 0;
}
long bx = b / x + 1;
long ans = bx - ax;

System.out.println(ans);


}
}
