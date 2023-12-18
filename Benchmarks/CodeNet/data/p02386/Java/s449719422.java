import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args){
    	//行ごと読んで分割するロジックに変更
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        	//1行目はサイコロの個数
            int n = Integer.parseInt(br.readLine());
            int o[][] = new int[n][6];

            for (int i=0; i < n; i++){
            	String str[] = br.readLine().split("\\s+");
                for(int j = 0; j < str.length; j++){
                	o[i][j] = Integer.parseInt(str[j]);
                }

            }
        br.close();
        Dice3 dice[] = new Dice3[n];

        final String order = "NNNNWNNNWNNNENNNENNNWNNNWNNNWNNNENNNENNNWNNN";
        //diceが全てあったときのフラグfalseにしておいて１つでもtrueになったら終了
        boolean flg = false;
        for(int k=0; k < n-1; k++){
            dice[k] = new Dice3(o[k][0],o[k][1],o[k][2],o[k][3],o[k][4],o[k][5]);
            for(int l=k+1;l < n;l++) {
                dice[l] = new Dice3(o[l][0],o[l][1],o[l][2],o[l][3],o[l][4],o[l][5]);
                //order 回して合ってるか確認する。
                for(int r=0;r < order.length(); r++){
            		if (dice[k].equals(dice[l])) {
            				flg = true;
            				break;
            		}
            		String odr = order.substring(r, r+1);
            		if ("N".equals(odr)){
            			dice[l].N();
            		} else if ("E".equals(odr)) {
            			dice[l].E();
            		} else if ("W".equals(odr)) {
            			dice[l].W();
            		} else if ("S".equals(odr)) {
            			dice[l].S();
            		}
            	}
            }
        }
        if(flg) {
        	System.out.println("No");
        } else {
        	System.out.println("Yes");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    class Dice3{
		int one;
		int two;
		int three;
		int four;
		int five;
		int six;
		int tmp;
    	Dice3(int a, int b, int c, int d, int e, int f){
    		one=a;
    		two=b;
    		three=c;
    		four=d;
    		five=e;
    		six=f;
    	}
    	boolean equals(Dice3 b) {
    		if ((this.one==b.one)&&(this.two==b.two)&&(this.three==b.three)&&(this.four==b.four)&&(this.five==b.five)&&(this.six==b.six)){
    			return true;
    		}
    		return false;
    	}
       	void N(){//1-2-6-5
    		tmp =this.one;
    		one=this.two;
    		two=this.six;
    		six=this.five;
    		five=tmp;
    	}
    	void E(){//1-4-6-3
    		tmp =this.one;
    		one=this.four;
    		four=this.six;
    		six=this.three;
    		three=this.tmp;
    	}
    	void W(){//1-3-6-4
    		tmp =this.one;
    		one=this.three;
    		three=this.six;
    		six=this.four;
    		four=tmp;
    	}
    	void S(){//1-5-6-2
    		tmp =this.one;
    		one=this.five;
    		five=this.six;
    		six=this.two;
    		two=tmp;
    	}
    	void turnR(){
    		tmp=this.two;
    		two=this.three;
    		three=this.five;
    		five=this.four;
    		four=tmp;
    	}
    	void print(){
    		System.out.printf("%d %d %d %d %d %d %n", one,two,three,four,five,six);
    	}
    }

