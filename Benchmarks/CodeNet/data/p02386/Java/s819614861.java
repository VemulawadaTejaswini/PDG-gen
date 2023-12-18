import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        try {
 
            int N = Integer.parseInt(br.readLine());
            Dice dice[] = new Dice[N];
            for(int i = 0; i < dice.length; i++)dice[i] = new Dice(); //★★クラス型配列は、入れ物を作った後に、それぞれnewする必要がある★★
 
            //String str[] = new String[6];
            int array[] = new int[6];
 
            //N個のDice情報を取得
            for(int i = 0; i < N; i++){
                String str[] = br.readLine().split("\\s+");
 
                for(int k = 0; k < str.length; k++){
                    array[k] = Integer.parseInt(str[k]);
                }
 
                dice[i].setNumber(array[0], array[1], array[2], array[3], array[4], array[5]);
            }
 
            boolean FLG = true;
 
            for(int i = 0; i < N-1; i++){
                for(int k = i+1; k < N; k++){
                    if(dice[i].equals(dice[k])){
                        FLG = false;
                        break;
                    }
                }
                if(!FLG)break;
            }
 
            if(FLG){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
//0:中央 1:南 2:東 3:西 4:北 5:裏側
class Dice{
 
    private int number[];
    private int work[];
    private final String order = "NNNNWNNNWNNNENNNENNNWNNN";
 
    Dice(){
        number = new int[6];
        work = new int[6];
    }
 
 
    public void roll(char dst){
        for(int i = 0; i < 6; i++) work[i] = number[i];
        switch(dst){
        case 'E':
            setNumber(work[3],work[1],work[0],work[5],work[4],work[2]);
            break;
        case 'N':
            setNumber(work[1],work[5],work[2],work[3],work[0],work[4]);
            break;
        case 'S':
            setNumber(work[4],work[0],work[2],work[3],work[5],work[1]);
            break;
        case 'W':
            setNumber(work[2],work[1],work[5],work[0],work[4],work[3]);
            break;
        }
    };
 
    public int getTop(){
        return number[0];
    }
 
    public void setNumber(int n0,int n1,int n2,int n3,int n4,int n5){
        number[0] = n0;
        number[1] = n1;
        number[2] = n2;
        number[3] = n3;
        number[4] = n4;
        number[5] = n5;
    }
 
    public boolean equals(Object object){
 
        if(object == this)return true;
        if(object == null)return false;
        if(!(object instanceof Dice))return false;
 
        Dice another = (Dice)object;
 
        boolean FLG;
 
        for(int i = 0; i < order.length(); i++){
            roll(order.charAt(i));
            FLG = true;
            for(int k = 0; k < 6; k++){
                if(this.number[k] != another.number[k]){
                    FLG = false;
                    break;
                }
            }
            if(FLG)return true;
        }
 
        return false;
    }
};

Compile Error Logs:

ステータス
Judge: 20/20	JAVA	CPU: 00:06 sec	Memory: 26608 KB	Length: 2617 B	2018-02-05 20:42
テストケースの判定結果
Case #	Verdict	CPU Time	Memory	In	Out	Case Name
Case #1	: Accepted	00:04	24276	38	3	00_sample_00.in
Case #2	: Accepted	00:04	24328	38	4	00_sample_01.in
Case #3	: Accepted	00:04	24228	50	4	01_yes_00.in
Case #4	: Accepted	00:04	24304	62	4	01_yes_01.in
Case #5	: Accepted	00:05	24256	38	4	01_yes_02.in
Case #6	: Accepted	00:05	24216	26	4	01_yes_03.in
Case #7	: Accepted	00:04	24472	74	3	02_no_00.in
Case #8	: Accepted	00:04	24276	26	3	02_no_01.in
Case #9	: Accepted	00:05	24280	26	4	03_corner_00.in
Case #10	: Accepted	00:05	24324	26	4	03_corner_01.in
Case #11	: Accepted	00:04	24316	26	4	03_corner_02.in
Case #12	: Accepted	00:04	24316	26	4	03_corner_03.in
Case #13	: Accepted	00:03	24312	26	4	03_corner_04.in
Case #14	: Accepted	00:04	24308	26	4	03_corner_05.in
Case #15	: Accepted	00:05	25192	363	4	04_all_diff_00.in
Case #16	: Accepted	00:06	26608	1204	4	04_all_diff_01.in
Case #17	: Accepted	00:05	24760	1204	3	05_almost_00.in
Case #18	: Accepted	00:05	24956	1204	3	05_almost_01.in
Case #19	: Accepted	00:04	24480	1204	3	05_almost_02.in
Case #20	: Accepted	00:05	24828	1204	3	05_almost_03.in

< prev |		/		| next >	 		
 
Judge Input #  ( | )		Judge Output #  ( | )

