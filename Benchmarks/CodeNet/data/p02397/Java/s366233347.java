import java.util.Scanner;

class main{
public static void main(String[] args){

Scanner inp = new Scanner(System.in);
int x, y;
int batas = 0;

while (batas<=3000){
x = inp.nextInt();
y = inp.nextInt();

if ((x<=10000)&&(y<=100000)){
if (x>y)
System.out.println(y+" "+x);
else
System.out.println(x+" "+y);

batas++;
}
}

}
}
