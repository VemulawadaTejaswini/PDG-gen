import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        String suit = null;
        int number = 0;
        int[] spade = new int[13];
        int[] heart = new int[13];
        int[] club = new int[13];
        int[] diamond = new int[13];
        int a = 0, b = 0, c = 0, d = 0;
        while(input.hasNext()){
            suit = input.next();
            number = input.nextInt();
            if(suit.compareTo("S") == 0){
                spade[a] = number;
                a++;
            }
            else if(suit.compareTo("H") == 0){
                heart[b] = number;
                b++;
            }
            else if(suit.compareTo("C") == 0){
                club[c] = number;
                c++;
            }
            else if(suit.compareTo("D") == 0){
                diamond[d] = number;
                d++;
            }
        }
        rank(spade, "S");
        rank(heart, "H");
        rank(club, "C");
        rank(diamond, "D");
    }
    
	public static void rank(int[] arr, String su) {
		int len = arr.length;
		int preIndex, current;
		for (int i = 1; i < len; i++) {
			preIndex = i - 1;
			current = arr[i];
			while (preIndex >= 0 && arr[preIndex] > current) {
				arr[preIndex + 1] = arr[preIndex];
				preIndex--;
			}
			arr[preIndex + 1] = current;
		}
		for(int i = 1; i <= 13; i ++ ){
  	        int cnt = 0;
  	        for (int j = 0; j < arr.length; j ++){
                if(arr[j] == i)
                    cnt = 1;
            }
            if(cnt == 0){
                System.out.print(su + " ");
                System.out.println(i);
            }
	    }
	}
 }
