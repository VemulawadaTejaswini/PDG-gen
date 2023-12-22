import java.util.Scanner;

class Main {
public static void main(String[] args) {

Scanner inp = new Scanner(System.in);

int a = inp.nextInt();
int b = inp.nextInt();
int c = inp.nextInt();

int cek = 0;

for(int i = a; i<=b; i++){
if (c%i==0)cek++;
}

System.out.println(cek);

}
}
