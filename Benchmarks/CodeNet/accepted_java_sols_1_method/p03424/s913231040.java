/*
 * 日本では、3 月 3 日にひなあられという、色のついたお菓子をお供えする習慣があります。
 * 
 * 1 つの袋があり、ひなあられが N 個入っています。
 * 
 * この袋には、桃色、白色、緑色の 3 種類か、桃色、白色、緑色、黄色の 4 種類のひなあられが入っていることが分かっています。
 * 
 * 桃色を P、白色を W、緑色を G、黄色を Y と表したとき、袋からひなあられを 1 粒ずつ取り出していったところ、i 番目に取り出したひなあられの色は Si でした。
 * 
 * この袋に 3 種類のひなあられが入っていた場合は Three、4 種類のひなあられが入っていた場合は Four と出力してください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int n = Integer.parseInt(sc.next());
            for(int i=0; i<n; i++){
            	// 文字列の入力
                String a = sc.next();
                if(a.equals("Y")){
                	// 出力
                    System.out.println("Four");
                    return;
                }
            }
            // 出力
            System.out.println("Three");
            
            sc.close();
        }
    }
