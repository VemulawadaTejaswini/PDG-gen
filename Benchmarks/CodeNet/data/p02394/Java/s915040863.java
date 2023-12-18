import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner inp = new Scanner(System.in);
int w = inp.nextInt();
int h = inp.nextInt();
int x = inp.nextInt();
int y = inp.nextInt();
int r = inp.nextInt();

int indikator = 0;
int xplus = x+r;
int xmin = x-r;
int yplus = y+r;
int ymin = y-r;

if ((xplus>w)||(xplus<0))
indikator = 1;
if ((xmin>w)||(xmin<0))
indikator = 1;
if ((yplus>h)||(yplus<0))
indikator = 1;
if ((ymin>h)||(ymin<0))
indikator = 1;

if (indikator == 1)
System.out.println("No");
else 
System.out.println("Yes");

}
}
