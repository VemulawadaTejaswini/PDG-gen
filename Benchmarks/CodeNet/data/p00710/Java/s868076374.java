public class Main {
	public static void main(String[] agrs) {
	    Scanner sc = new Scanner(System.in);
	        for(;;){
	            int n = sc.nextInt();//输入数组数
	            int r = sc.nextInt();//输入循环几次	             
	            if( n==0 && r==0) {
	                break;
	            }	             
	            int[] input = new int[n];
	            for(int i = 0; i < n ; i++){
	                input[i] = n - i;
	            }	             
	            for(int i = 0; i < r ; i++){
	                int p = sc.nextInt()-1;//输入顶牌交换的地方
	                int c = sc.nextInt();    //下层交换地方             
	                int[] deck = input.clone();	                 
	                for(int j = 0 ; j < c ; j++){
	                    deck[j] = input[j+p];
	                }
	                for(int j = 0; j < p ; j ++){
	                    deck[j+c] = input[j];
	                }
	                input = deck;
	            }
	            System.out.println(input[0]);
	        }
	}
	}

