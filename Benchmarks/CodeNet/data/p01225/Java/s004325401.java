import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt(); //手札の総数
        int check = 0;	
        int[]sort = new int[9];  //カード並べ替えのときに使用
        int[]color = new int[9];
        int[]num = new int[9];
        
        for (int h = 0; h < times; h++) {
        	int count = 0;
        	int red = 0;			//それぞれのカードの枚数を記録する
        	int green = 0;
        	int blue = 0;
        	for (int i = 0; i < 9; i++) {	//カードの番号を代入
        		num[i] = sc.nextInt();
        	}
        	for (int i = 0; i < 9; i++) {	//カードの色を代入
        		String colorstr = sc.next();
        		if (colorstr.equals("R")) {		//赤は10、緑は20、青は30に変換し、color[]に代入する
        			color[i] = 10;
        		} else if (colorstr.equals("G")) {
        			color[i] = 20;
        		} else {
        			color[i] = 30;
        		}
        	}
        	for (int i = 0;i < 9; i++) {	//カラーと番号を統一させ、２桁の整数にする
        		sort[i] = num[i] + color[i];
        	}
        	Arrays.sort(sort);		//昇順にすることで、番号の若い赤から番号ごとに順番に並べることができる
        	for (int i = 0; i < 9; i++) {		//昇順にした順番にnum配列に代入しなおす colorはテストのときに見やすくするために処理
        		color[i] = sort[i] /10;
        		num[i] = sort[i] %10;
        		if (color[i] == 1) {
        			red++;
        		} else if (color[i] == 2) {
        			green++;
        		} else {
        			blue++;
        		}
        	}
        	if (red %3 != 0 || green %3 !=0 || blue %3 !=0) {	//データをそろえるためには色が必ず０もしくは３の倍数でなければならない
        		System.out.println("0");						//なので、それ以外はここで除く
        		continue;
        	}
        	//色を集合させ、応じた数値も昇順に並べ替えた----------------------------------------------------------------

        	for (int i = 0; i <red-2 ; i ++) {//まず色ごとに番号が３つ同じものがあるか順に調べる -2は後ろ2つは調べる必要がないため
        		for (int j = 1; j < 3; j++) {//3つのカードが同じかどうかなので、最初のカードから2つとなりまで調べてそれを繰り返す
        			if (num[i] == num[i + j]) {
        				check++;	//同じものがあればcheck変数に記録する
        			} else {		//一致しないものがあた場合、それまでcheckに記録したものは0にし、次の番号に移行する
        				check = 0;
        				break;
        			}
        			if (check == 2) {	//3枚同じ番号があれば、それぞれの番号を0にする
        				check = 0;
        				num[i] = 0;
        				num[i+1] = 0;
        				num[i+2] = 0;

        			}
        		}
        	}
        	check = 0;
        		for (int i = red; i < red +green - 2; i++) {
        			for (int j = 1; j < 3 ; j++) {
        				if (num[i] == num[i + j]) {
        					check++;
        				} else {
        					check = 0;
        					break;
        				}
        				if (check == 2) {
        					check = 0;
        					num[i] = 0;
        					num[i+1] = 0;
        					num[i+2] = 0;
        				}
        			}
        		}
        	check = 0;
        		for (int i = red + green; i < red +green + blue - 2; i++) {
        			for (int j = 1; j < 3 ; j++) {
        				if (num[i] == num[i + j]) {
        					check++;
        				} else {
        					check = 0;
        					break;
        				}
        				if (check == 2) {
        					check = 0;
        					num[i] = 0;
        					num[i+1] = 0;
        					num[i+2] = 0;
        				}
        			}
        		}
    outside:for (int i = 0; i < red -2; i++) {	//
    			count=0;
    			int a = 0;
    			int b = 0;
    			if (num[i] == 0) {
    				continue;
    			}
        		for ( int j = 1; j < red - i; j++) {
        			if (num[i] == num[i + j] -(count +1)) {
        				count++;
        				if (count == 1) {
        					a = i + j;
        				} else if (count == 2) {
        					b = i + j;
        					num[i]=0;
        					num[a]=0;
        					num[b]=0;
        					break;
        				}
        			}
        		}
        	}
        	for (int i = red; i < red + green -2; i++) {
    			count=0;
    			int a = 0;
    			int b = 0;
    			if (num[i] == 0) {
    				continue;
    			}
        		for ( int j = 1; j < green - i + red; j++) {
        			if (num[i] == num[i + j] -(count + 1)) {
        				count++;
        				if (count == 1) {
        					a = i + j;
        				} else if (count == 2) {
        					b = i + j;
        					num[i]=0;
        					num[a]=0;
        					num[b]=0;
        					break;
        							
        				}
        			}
        		}
        	}
        	for (int i = red + green; i < red + green + blue -2; i++) {
    			count=0;
    			int a = 0;
    			int b = 0;
    			if (num[i] == 0) {
    				continue;
    			}
        		for ( int j = 1; j < blue - i + red + green; j++) {
        			if (num[i] == num[i + j] -(count +1)) {
        				count++;
        				if (count == 1) {
        					a = i + j;
        				} else if (count == 2) {
        					b = i + j;
        					num[i]=0;
        					num[a]=0;
        					num[b]=0;
        					break;
        				}
        			}
        		}
        	}
        	check = 0;
        	for (int i = 0; i < 9; i ++) {
        		check += num[i];
        	}
        	if (check == 0) {
        		System.out.println("1");
        	} else {
        		System.out.println("0");
        	}
        }
    }
}

