import java.util.Scanner;

class Main {
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int W = sc.nextInt();
int H = sc.nextInt();
int x = sc.nextInt();
int y = sc.nextInt();
int r = sc.nextInt();
int errorflg = 0;
if (x >= -100 && x <= 100){
if (y >= -100 && y <= 100){
if (W >= 0 && W <= 100){
if (H >= 0 && H <= 100){
if (r >= 0 && r <= 100){
if ((x - r < 0) || (x + r > W)){
errorflg = 1;
} 
if ((y - r < 0) || (y + r > H)){
errorflg = 1;
}
if (errorflg == 1){
System.out.println("No");
} else {
System.out.println("Yes");
}
}
}
}
}
}
}
}

