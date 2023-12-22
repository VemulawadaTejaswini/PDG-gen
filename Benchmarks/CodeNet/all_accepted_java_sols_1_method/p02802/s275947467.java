import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	if(m == 0){
    		System.out.println("0" + " " + "0");
    		System.exit(0);
    	}
    	int[] iAry = new int[m];
    	String[] sAry = new String[m];
     	int[] ans = new int[2];
    	for(int i = 0; i < m; i++){
    		iAry[i] = sc.nextInt();
    		sAry[i] = sc.nextLine().trim();
    	}
    	sc.close();
    	int[] wrong = new int[n];
    	boolean[] isCorrect = new boolean[n];
    	for(int i = 0; i < m; i++){
    		int p = iAry[i]-1;
    		if(isCorrect[p]) continue;
    			if(sAry[i].equals("AC")){
    				ans[0]++;
    				isCorrect[p] = true;
    				ans[1] += wrong[p];
    			}else{
    				wrong[p]++;
    			}
    	}
    	System.out.println(ans[0] + " " + ans[1]);
    }
}