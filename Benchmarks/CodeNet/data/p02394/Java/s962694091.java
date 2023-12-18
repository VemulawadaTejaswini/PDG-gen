import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int w = sc.nextInt();
int h = sc.nextInt();
int x = sc.nextInt();
int y = sc.nextInt();
int r = sc.nextInt();
if(w<r*2 || h<r*2){
System.out.println("No");
}
else if(x<r || y<r){
System.out.println("No");
}
else{
System.out.println("Yes");
}

}
}