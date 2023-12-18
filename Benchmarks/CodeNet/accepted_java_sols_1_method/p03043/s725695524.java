import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
        int n = sc.nextInt();
        int k = sc.nextInt();
        double answer=0;
        for(int i=1;n+1>i;i++) {
        	int count=i;
        	int j=0;
        	while(true) {
        		if(count>=k)
        			break;
        		count = count*2;
        		j++;
        	}
        	answer=answer+1/(double)n*Math.pow(0.5,j);
        	//System.out.println(answer);
        }
        System.out.println(answer);
	}
}