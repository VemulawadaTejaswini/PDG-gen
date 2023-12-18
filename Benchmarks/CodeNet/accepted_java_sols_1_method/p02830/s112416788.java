import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();String s1 = sc.next();char[] c1 = s1.toCharArray();String s2=sc.next();char[] c2=s2.toCharArray();
        char[] array = new char[2*n];int tmp1=0;int tmp2=0;
        for(int i=0;i<array.length;i+=2){
            array[i]=c1[tmp1];
            tmp1++;
        }
        for(int i=1;i<array.length;i+=2){
            array[i]=c2[tmp2];
            tmp2++;
        }
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]);
        }
    }