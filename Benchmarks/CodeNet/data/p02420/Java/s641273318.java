import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s;
		int m,h;
		StringBuilder sb;
        while(true){
    		s=in.next();
    		if(s.equals("-")) break;
            m=in.nextInt();
    		sb=new StringBuilder(s);
            for(int i=0;i<m;i++){
                h=in.nextInt();
                sb.append(sb.substring(0,h));
                sb.delete(0,h);
            }
            System.out.println(sb);
        }
	}
}