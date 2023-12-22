import java.util.Scanner;
public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

while (true) {
int H = sc.nextInt();
int W = sc.nextInt();
if (H == 0 && W == 0) {
break;

}int i, j;
for ( i = 0; i < W; i++) {
    System.out.printf("#");
    }System.out.printf("\n");

for ( j = 0 ; j < H-2; j++) {
    System.out.printf("#");
for ( i = 0 ; i < W-2; i++){
    System.out.printf(".");
}System.out.printf("#");
System.out.printf("\n");
}

for ( i = 0; i < W; i++) {
    System.out.printf("#");
    }System.out.printf("\n");
    System.out.printf("\n");
}
}
}
