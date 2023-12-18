public class Main {
	public static void main(String[] args){
                for(int i=1; i>0; i++){
                        int iNum = new java.util.Scanner(System.in).nextInt();
                        if(iNum == 0)
                                break;
                        System.out.println("Case " + i + ": " + iNum);
                }
	}
}