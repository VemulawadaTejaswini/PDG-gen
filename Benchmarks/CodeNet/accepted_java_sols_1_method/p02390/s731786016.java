import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int X = scan.nextInt();
int A = X/3600;
int B = (X%3600)/60;
int C = (X%60);
System.out.println(A+":"+B+":"+C);
}}
