//Volume5-0516
import java.util.ArrayDeque;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

    	ArrayDeque<Integer> q = new ArrayDeque<Integer>();

        Scanner sc = new Scanner(System.in);

        while(true){

        	int n = sc.nextInt();
        	int k = sc.nextInt();

        	if(n==0&&k==0){break;}

        	int sum = 0,
        		max;

        	q.clear();

        	int tmp;
        	for(int i=0;i<k;i++,n--){
        		q.add(tmp = sc.nextInt());
        		sum += tmp;
        	}
        	max=sum;
        	while(n-- > 0){
        		q.add(tmp = sc.nextInt());
        		sum = sum - q.poll() + tmp;
        		if(sum>max){max = sum;}
        	}
        	System.out.println(max);
        }
    }
}