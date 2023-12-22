import java.util.*;


public class Main{
	public static void main(String args[]){
        int key = 1;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = new String[str.length()];
        for(int i = 0; i < str.length(); i++){
            String str2 = String.valueOf(str.charAt(i));
            array[i] = str2;
        }
        if( (str.length() % 2) == 0){
            for(int j = 0; j < str.length() / 2; j++){
                if(array[2*j].equals("L")){
                    key = 0;
                }
                if(array[2*j+1].equals("R")){
                    key = 0;
                }
            }
        }else{
            for(int j = 0; j < (str.length() / 2) + 1; j++){
                if(array[2*j].equals("L")){
                    key = 0;
                }
            }
            for(int j = 0; j < str.length() / 2; j++){
                if(array[2*j+1].equals("R")){
                    key = 0;
                }
            }
        }
        if(key == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}