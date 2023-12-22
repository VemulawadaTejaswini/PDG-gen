/*
 * あなたは、X 円を持ってケーキとドーナツを買いに出かけました。
 * 
 * あなたはまずケーキ屋で 1 個 A 円のケーキを 1 個買いました。 次に、ドーナツ屋で 1 個 B 円のドーナツをできるだけたくさん買いました。
 * 
 * これらの買い物のあと手元に残っている金額は何円ですか。 
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int x = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            //出力
            System.out.println(x-a-((x-a)/b)*b);
            sc.close();
        }
    }
	