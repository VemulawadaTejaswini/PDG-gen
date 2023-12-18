import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int min = 0;
int profit = -1000000000;
int maxP = -1000000000;
int n = sc.nextInt();
list<String> R[] = new Arraylist<String>(){
for(int i = 0; i < n; i++){
add R[i] =sc.nextInt() }
}
min = R[0];

for(int i = 1; i < n; i++){
maxP = Math.max(maxP,R[i]-min);
min = Math.min(min,R[i]);
}
System.pout.println(maxP);
}
}
