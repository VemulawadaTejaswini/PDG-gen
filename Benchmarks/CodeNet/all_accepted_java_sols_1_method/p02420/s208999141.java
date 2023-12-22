import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
        while(true){
    		String s=in.next();
    		if(s.equals("-"))break;
            int k=in.nextInt();
    		StringBuilder sb = new StringBuilder(s);
            for(int i=0;i<k;i++){
                int h=in.nextInt();
                sb.append(sb.substring(0,h));
                sb.delete(0, h);
            }
            System.out.println(sb);
        }
	}
}