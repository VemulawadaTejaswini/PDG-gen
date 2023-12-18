import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> stack = new ArrayDeque<Integer>();
		int data = sc.nextInt();
		for(int i=0; i<data; i++){
			String str = sc.next();
			int flag1 = 0, flag2 = 0, maxphase = 0;
			int[] count = new int[str.length()/3];
			for(int j=0; j<str.length(); j++){
				if(str.charAt(j)>='0'&&str.charAt(j)<='9'){
					int temp = str.charAt(j) - '0';
					while(str.charAt(j+1)>='0'&&str.charAt(j+1)<='9'){
						temp = 10*temp + (str.charAt(++j) - '0');
					}
					stack.push(temp);
					count[-1*flag1]++;
				}else if(str.charAt(j)==']'){
					flag2--;
					if(flag2 != flag1){
						int[] phase = new int[count[-1*flag1+1]];
						int k = 0;
						while(stack.peek()!=flag1+1){
							if(stack.peek()>0){
								phase[k++] = stack.pop();
							}else{
								stack.pop();
							}
						}
						Arrays.sort(phase);
						int sum = 0;
						for(k=0; k<=count[-1*flag1+1]/2; k++){
							if(-1*flag1+1==maxphase){
								sum += (phase[k]+1)/2;
							}else{
								sum += phase[k];
							}
						}
						stack.push(sum);
						count[-1*flag1+1] = 0;
						count[-1*flag1]++;
					}
					flag1++;
				}else{
					flag2 = flag1;
					stack.push(flag1--);
					if(maxphase<-1*flag1) maxphase = -1*flag1;
				}
			}
			System.out.println(stack.pop());
		}
	}
}