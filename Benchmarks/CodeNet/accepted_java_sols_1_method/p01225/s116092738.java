import java.util.*;
//ラミー
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//データセット数
        int[] cardNum = new int[9];//カードの数字
        String[] color = new String[9];//カードの色
        String[] card = new String[9];//数字と色の組み合わせ
        String[] checkCard = new String[2];//数字と色の組み合わせ
        
        int check = 0;//上がりの１、出来ずは０に       
        int count = 0;
        
        for(int x = 0; x < n; x++){
//１セットめからスタート
            for(int i = 0; i < 9; i++){
                cardNum[i]= sc.nextInt();
//検証用        System.out.println(cardNum[i]);
            }
            for(int i = 0; i < 9; i++){
                color[i]=sc.next();
//検証用        System.out.println(color[i]);
            }
            for(int i = 0; i < 9; i++){
                card[i] = (cardNum[i] + color[i]);
//検証用        System.out.println(card[i]);
            }
             ArrayList<Integer> red = new ArrayList<Integer>();//Ｒ:赤用
             ArrayList<Integer> green = new ArrayList<Integer>();//Ｇ:緑用
             ArrayList<Integer> blue = new ArrayList<Integer>();//Ｂ:青用
    
             for(int i = 0; i < 9; i++){
                 checkCard = card[i].split("");

                int num =  Integer.parseInt(checkCard[0]);
                
                if("R".equals(checkCard[1])){
                    red.add(num);

                }else if("G".equals(checkCard[1])){
                    green.add(num);

                }else if("B".equals(checkCard[1])){
                    blue.add(num);
                }
             }
//ここから！　Ｒからチェックしていく

             if(red.size() != 0){
                Collections.sort(red);

                    if(red.size() == 9){
                        if((red.get(6) == red.get(7) && red.get(7) == red.get(8))
                        ||(red.get(6)+1 == red.get(7) && red.get(7)+1 == red.get(8))){
                            count++;
                            red.remove(8);
                            red.remove(7);
                            red.remove(6);
                        }
                        else if((red.get(0) == red.get(1) && red.get(1) == red.get(2))
                        ||(red.get(0)+1 == red.get(1) && red.get(1)+1 == red.get(2))){
                            count++;
                            red.remove(2);
                            red.remove(1);
                            red.remove(0);
                        }
                    }
        
                    if(red.size() == 6){
                        if((red.get(3) == red.get(4) && red.get(4) == red.get(5))
                        ||(red.get(3)+1 == red.get(4) && red.get(4)+1 == red.get(5))){
                            count++;
                            red.remove(5);
                            red.remove(4);
                            red.remove(3);
                        }
                        else if((red.get(0) == red.get(1) && red.get(1) == red.get(2))
                        ||(red.get(0)+1 == red.get(1) && red.get(1)+1 == red.get(2))){
                            count++;
                            red.remove(2);
                            red.remove(1);
                            red.remove(0);
                        }
                        else if((red.get(0)+1 == red.get(2) && red.get(2)+1 == red.get(4))){
                            count++;
                            red.remove(4);
                            red.remove(2);
                            red.remove(0);
                        }
                        else if((red.get(1)+1 == red.get(3) && red.get(3)+1 == red.get(5))){
                            count++;
                            red.remove(5);
                            red.remove(3);
                            red.remove(1);
                        }
                    }
                    if(red.size() == 3){
                        if((red.get(0) == red.get(1) && red.get(1) == red.get(2))
                        ||(red.get(0)+1 == red.get(1) && red.get(1)+1 == red.get(2))){
                            count++;
/*                            red.remove(2);
                            red.remove(1);
                            red.remove(0);*/
                        }
                    }
             }
 //ここからＧ緑をチェックしていく           
        
             if(green.size() != 0){
                Collections.sort(green);
                 
                    if(green.size() == 9){
                        if((green.get(6) == green.get(7) && green.get(7) == green.get(8))
                        ||(green.get(6)+1 == green.get(7) && green.get(7)+1 == green.get(8))){
                            count++;
                            green.remove(8);
                            green.remove(7);
                            green.remove(6);
                        }
                        else if((green.get(0) == green.get(1) && green.get(1) == green.get(2))
                        ||(green.get(0)+1 == green.get(1) && green.get(1)+1 == green.get(2))){
                            count++;
                            green.remove(2);
                            green.remove(1);
                            green.remove(0);
                        }
                    }
        
                    if(green.size() == 6){
                        if((green.get(3) == green.get(4) && green.get(4) == green.get(5))
                        ||(green.get(3)+1 == green.get(4) && green.get(4)+1 == green.get(5))){
                            count++;
                            green.remove(5);
                            green.remove(4);
                            green.remove(3);
                        }
                        else if((green.get(0) == green.get(1) && green.get(1) == green.get(2))
                        ||(green.get(0)+1 == green.get(1) && green.get(1)+1 == green.get(2))){
                            count++;
                            green.remove(2);
                            green.remove(1);
                            green.remove(0);
                        }
                        else if((green.get(0)+1 == green.get(2) && green.get(2)+1 == green.get(4))){
                            count++;
                            green.remove(4);
                            green.remove(2);
                            green.remove(0);
                        }
                        else if((green.get(1)+1 == green.get(3) && green.get(3)+1 == green.get(5))){
                            count++;
                            green.remove(5);
                            green.remove(3);
                            green.remove(1);
                        }
                    }
                    if(green.size() == 3){
                        if((green.get(0) == green.get(1) && green.get(1) == green.get(2))
                        ||(green.get(0)+1 == green.get(1) && green.get(1)+1 == green.get(2))){
                            count++;
  /*                          green.remove(2);
                            green.remove(1);
                            green.remove(0);*/
                        }
                    }
                }
 //ここからＢ青スタート        
        
             if(blue.size() != 0){
                Collections.sort(blue);
 
                    if(blue.size() == 9){
                        if((blue.get(6) == blue.get(7) && blue.get(7) == blue.get(8))
                        ||(blue.get(6)+1 == blue.get(7) && blue.get(7)+1 == blue.get(8))){
                            count++;
                            blue.remove(8);
                            blue.remove(7);
                            blue.remove(6);
                        }
                        else if((blue.get(0) == blue.get(1) && blue.get(1) == blue.get(2))
                        ||(blue.get(0)+1 == blue.get(1) && blue.get(1)+1 == blue.get(2))){
                            count++;
                            blue.remove(2);
                            blue.remove(1);
                            blue.remove(0);
                        }
                    }
        
                    if(blue.size() == 6){
                        if((blue.get(3) == blue.get(4) && blue.get(4) == blue.get(5))
                        ||(blue.get(3)+1 == blue.get(4) && blue.get(4)+1 == blue.get(5))){
                            count++;
                            blue.remove(5);
                            blue.remove(4);
                            blue.remove(3);
                        }
                        else if((blue.get(0) == blue.get(1) && blue.get(1) == blue.get(2))
                        ||(blue.get(0)+1 == blue.get(1) && blue.get(1)+1 == blue.get(2))){
                            count++;
                            blue.remove(2);
                            blue.remove(1);
                            blue.remove(0);
                        }
                        else if((blue.get(0)+1 == blue.get(2) && blue.get(2)+1 == blue.get(4))){
                            count++;
                            blue.remove(4);
                            blue.remove(2);
                            blue.remove(0);
                        }
                        else if((blue.get(1)+1 == blue.get(3) && blue.get(3)+1 == blue.get(5))){
                            count++;
                            blue.remove(5);
                            blue.remove(3);
                            blue.remove(1);
                        }
                    }
                    if(blue.size() == 3){
                        if((blue.get(0) == blue.get(1) && blue.get(1) == blue.get(2))
                        ||(blue.get(0)+1 == blue.get(1) && blue.get(1)+1 == blue.get(2))){
                            count++;
   /*                         blue.remove(2);
                            blue.remove(1);
                            blue.remove(0);*/
                        }
                    }
             }//判定する
                if(count == 3){
                    check = 1;
                }else{
                    check = 0;
                }System.out.println(check);
                count = 0;
        }
    }
}


