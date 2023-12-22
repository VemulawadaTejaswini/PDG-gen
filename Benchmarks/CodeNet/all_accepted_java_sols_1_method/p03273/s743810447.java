import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
        String kesu;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < w; i++) {
          builder.append(".");
        }
        kesu = builder.toString();
      
        ArrayList<String[]> list = new ArrayList<>();
        int[] whiteList = new int[w];
        int wRemoved = 0;
        // 横除去
        for(int i = 0; i < h; i++) {
          String value = sc.next();
          if (!value.equals(kesu)) {
            String[] splited = value.split("");
            list.add(splited);
        
            for(int index = 0; index < w; index++) {
              if (splited[index].equals(".")) {
                whiteList[index]++;
              }
            }
          } else {
            wRemoved++;
          }
        }
        // 縦除去
        for(int i = 0; i < w; i ++) {
          if (whiteList[i] == h - wRemoved) {
            for(int index = 0; index < list.size(); index++) {
              String[] target = list.get(index);
              target[i] = "";
              list.set(index, target);
            }
          }
        }
        for(int i = 0; i < list.size(); i++) {
          StringBuilder ansBuilder = new StringBuilder();
          String[] target = list.get(i);
          for(int index = 0; index < w; index++) {
            ansBuilder.append(target[index]);
          }
          // 出力
		  System.out.println(ansBuilder.toString()); 
        }
	}
}