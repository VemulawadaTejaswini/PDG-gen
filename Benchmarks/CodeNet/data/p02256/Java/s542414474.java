import java.util.Scanner;
public class Main {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
int x = Math.max(a,b);
int y = Math.min(a,b);
int out = helper(x,y);
System.out.println(out);
}

public static int helper(int x, int y){
if(y == 0){
return x;
} else if(x >= y){
return helper(y, x%y);
} else {
return 1;
}
}

}
