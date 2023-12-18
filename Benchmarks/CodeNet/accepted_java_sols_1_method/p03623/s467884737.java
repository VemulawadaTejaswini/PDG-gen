import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int a = sc.nextInt();
int b = sc.nextInt();
int A = x - a;
if(A < 0){
    A *= -1;
}
int B = x - b;
if(B < 0){
    B *= -1;
}
if(A < B){
  System.out.println("A");
}else{
  System.out.println("B");
}

}
}