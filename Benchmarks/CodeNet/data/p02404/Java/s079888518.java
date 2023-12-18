import java.util.Scanner;

Class Main {
public static void main(String[] args) {
Scanner inp = new Scanner(System.in);

while(true) {

int h = inp.nextInt();
int w = inp.nextInt();
if (h==0&&w==0)
break;
else {
for (int i = 0; i<h ; i++)
for (int j = 0; j<w ; j++) {

if(i==0 || i==(h-1))
System.out.print('#');
else {
if(j==0 || j==(h-1))
System.out.print('#');
else
System.out.print('.');
}
System.out.println();
}
}

}
}
}
