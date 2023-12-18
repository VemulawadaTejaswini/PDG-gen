import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String W=in.nextLine();
        String n=in.nextLine();
        String T="";
        while(!n.equals("END_OF_TEXT")){
        	T+=n;
        	n=in.nextLine();
        }
        T=T.toLowerCase();
        System.out.println((T.length()-T.replaceAll(W,"").length())/W.length());
	}
}