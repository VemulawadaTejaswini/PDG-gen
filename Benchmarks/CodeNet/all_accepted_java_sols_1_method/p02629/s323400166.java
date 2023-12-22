import java.util.*;
class Main {
	public static void main(String[] args) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q",
                                        "r","s","t","u","v","w","x","y","z"};
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Integer> list = new ArrayList<>();
        while(n>26){
            if(n%26==0){
                list.add(25);
                n=n/26-1;
            } else {
                list.add((int)(n%26-1));
                n/=26;
            }
        }
        System.out.print(alphabet[(int)n-1]);
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(alphabet[list.get(i)]);
        }
    }
}
