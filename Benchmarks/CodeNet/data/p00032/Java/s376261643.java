import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        ;
        int dia=0;
        int rec =0;
        while(scan.hasNext()){
        	scan.useDelimiter(",|\\r\\n");
        	int a=scan.nextInt();
        	int b=scan.nextInt();
        	int c=scan.nextInt();
        	if((int)Math.pow(a, 2)+(int)Math.pow(b, 2)==(int)Math.pow(c, 2))rec++;
        	if(a==b)dia++;
        	scan.useDelimiter("\\s*");
        }
        System.out.println(rec);
        System.out.println(dia);

  }
  }