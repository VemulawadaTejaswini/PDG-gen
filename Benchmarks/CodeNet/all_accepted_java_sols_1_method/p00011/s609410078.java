import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        int w=scan.nextInt();
        int [] line =new int[w+1];
        for(int i=1;i<w+1;i++)
        	line[i]=i;
        int n=scan.nextInt();
        scan.useDelimiter(",|\\n");
        while(n!=0){
        	
        	int a=scan.nextInt();
        	int b=scan.nextInt();
        	line[a]=line[a]^line[b];
        	line[b]=line[a]^line[b];
        	line[a]=line[a]^line[b];
        n--;	
        }
        for(int i =1;i<w+1;i++)
        System.out.println(line[i]);
    }
}