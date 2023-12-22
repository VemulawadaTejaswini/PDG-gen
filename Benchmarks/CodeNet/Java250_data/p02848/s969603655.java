import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();
        char[] b = a.toCharArray();
        int[] c = new int[b.length];
        int i=0;
        for (char b1 : b) {
        		c[i] = (int)b1;
        		i++;
        }
        for(int j=0; j<c.length; j++) {
        		int d = (c[j]-65+N)%26+65;
        		System.out.print((char)d);
        } 
    }
}