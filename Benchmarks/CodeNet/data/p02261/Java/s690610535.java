import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
	int N;
	boolean stablejudge = true;
	InputStream inputStream = System.in;
	InputReader input = new InputReader(inputStream);
	N = input.nextInt();
	String[] nums = new String[N];
	String[] numSelectionString = new String[N];
	String[] numBubbleString = new String[N];
	int[] numBubble = new int[N];
	int[] numSelection = new int[N];
	for(int i = 0;i < N;i++){
	    nums[i] = input.next();
	    numBubbleString[i] = nums[i];
	    numSelectionString[i] = nums[i];
	    numBubble[i] = Integer.parseInt(nums[i].substring(1));
	    numSelection[i] = Integer.parseInt(nums[i].substring(1));
	}
	print(bubbleSort(N,numBubble,numBubbleString));
		isStable(bubbleSort(N,numBubble,numBubbleString),bubbleSort(N,numBubble,numBubbleString));
	print(selectionSort(N,numSelection,numSelectionString));
	isStable(bubbleSort(N,numBubble,numBubbleString),selectionSort(N,numSelection,numSelectionString));

    }

        public static String[] bubbleSort(int N,int[] numBubble,String[] numBubbleString){
    	for(int i = 0;i < N - 1;i++){
    	    for(int j = N - 1;j > i;j--){
    		if(numBubble[j - 1] > numBubble[j]){
    		    int tmp = numBubble[j - 1];
    		    numBubble[j - 1] = numBubble[j];
    		    numBubble[j] = tmp;

    		    String temp = numBubbleString[j - 1];
    		    numBubbleString[j - 1] = numBubbleString[j];
    		    numBubbleString[j] = temp;
    		}
    	    }
    	}
    	return numBubbleString;
    }
        
    public static String[] selectionSort(int N,int[] numSelection,String[] numSelectionString){
	for(int i = 0;i < N;i++){
	    int minj = i;
	    for(int j = i;j < N;j++){
		//最小の要素を見つける
		if(numSelection[j] < numSelection[minj]){
		    //最小の要素の添字をminjに代入
		    minj = j;
		    
		}
	    }
	    
	    if(numSelection[i] != numSelection[minj]){
		int tmp = numSelection[i];
		numSelection[i] = numSelection[minj];
		numSelection[minj] = tmp;
		
		String temp = numSelectionString[i];
		numSelectionString[i] = numSelectionString[minj];
		numSelectionString[minj] = temp;
	    }
	}
	return numSelectionString;
    }
    

    
    // public static void print(int[] num){
    // 	String ans;
    // 	ans = Arrays.toString(num); //文字列に変換する
    // 	ans = ans.replaceAll(",", ""); //","を消去
    // 	ans = ans.replace("[", ""); // "["を消去
    // 	ans = ans.replace("]", ""); // "]"を消去
    // 	System.out.println(ans);
    // }
    static void print(String[] nums){
    	for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    static void isStable(String[] stable,String[] target){

	if(Arrays.equals(stable,target)){
	    System.out.println("Stable");
	}else{
	    System.out.println("Not stable");
	}
	
    }
}


class InputReader{
    StringTokenizer tokenizer;
    BufferedReader reader;
    //コンストラクタ
    public InputReader(InputStream stream){
	/*InputStreamReaderはバイトストリームから文字ストリームの橋渡しの役目を持ちこれ
	  が最高効率となる形になる*/
	reader = new BufferedReader(new InputStreamReader(stream),32768);
	tokenizer = null;
    }
    public String next(){
	while(tokenizer == null || !tokenizer.hasMoreTokens()){
	    try{
		tokenizer = new StringTokenizer(reader.readLine());
	    }catch(IOException e){
		throw new RuntimeException(e);
	    }
	}
	return tokenizer.nextToken();
    }
    public int nextInt(){
	
	return Integer.parseInt(next());
    }
}

