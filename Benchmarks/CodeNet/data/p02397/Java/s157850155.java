import java.util.Scanner;
class main{
static void main(String[] args){
Scanner inp = new Scanner(System.in);
int x, y;
int batas = 0;
while (batas<=3000){
x = inp.nextInt();
y = inp.nextInt();
if (x == 0 && y == 0) break;
if (x>y) System.out.println(x+" "+y);
else System.out.println(y+" "+x);
batas++;
}
 
}
}
