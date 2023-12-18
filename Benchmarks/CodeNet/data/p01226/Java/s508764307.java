//AOJ BattleTown

import java.util.ArrayList;
import java.util.Scanner;

class Main{
    
    /**
     * ????????°????????¨?????????????????????
     * @param args
     */
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<char[][]> list = new ArrayList<char[][]>();
        
        //???????????????????????°?????\???
        int setCountData = sc.nextInt();
        
        //??\???????????????????????????????????°?????°?????????
        for( int i = 0 ; i < setCountData ; i++ ){
        	
        	int aryCountNum1 = sc.nextInt();
        	int aryCountNum2 = sc.nextInt();
        	
            //??°??????????????°?????¨??????????????????
            char[][] aryBattleArea = new char[aryCountNum1][aryCountNum2];
            
            //??????aryBattleArea???????????????????´???\???
            for( int j = 0 ; j < aryBattleArea.length ; j++ ){
            	
                aryBattleArea[j] = sc.next().toCharArray();
                
            }
            
            int intOperationLength = sc.nextInt();
            
            //??°??????????????°?????¨??????????????????
            char[] aryOperation = new char[intOperationLength];
            
            //??????aryOperation?????????????????\?????????????????????????????¨????????????????´?
            aryOperation = sc.next().toCharArray();
            
            //BattleTown????????????????????????
            BattleTown insBt = new BattleTown( aryBattleArea , aryOperation );
            
            aryBattleArea = insBt.runOperation();
            
            list.add(aryBattleArea);
        }
        
        for( int i = 0 ; i < list.size() ; i++ ){
        	
        	char[][] s = list.get(i);
        	
        	for( int j = 0 ; j < s.length ; j++ ){
        		for( int k = 0 ; k < s[i].length ; k++ ){
        			
        			System.out.print(s[j][k]);
        			
        		}
        		System.out.println();
        	}
        	System.out.println();
        }
        
    }
}

/**
 * 
 * ?????????????????????
 * @author SS-Internship01
 *
 */
class BattleTown{
    
    private char[][] aryBattleArea;
    private char[] aryOperation;
    
    /**
     * ?????????????????????
     * @param aryBattleArea ?????´?????¨???????¬??????????
     * @param aryOperation ???????????¨???????¬??????????
     */
    public BattleTown(char[][] aryBattleArea , char[] aryOperation ){
        
        this.aryBattleArea = aryBattleArea;
        this.aryOperation = aryOperation;
        
    }
    
    /**
     * ?????????????????????????????????actionTank???????????????
     * ??????????????????'0'????????????????????????????????????
     */
    public char[][] runOperation(){
        
        for( int k = 0 ; k < aryOperation.length ; k++ ){
            
            if( aryOperation[k] != '0' ){
            
                for( int i = 0 ; i < aryBattleArea.length ; i++ ){
                    for( int j = 0 ; j < aryBattleArea[i].length ; j++ ){
                        
                        if( aryBattleArea[i][j] == '^' || aryBattleArea[i][j] == 'v' 
                            || aryBattleArea[i][j] == '<'|| aryBattleArea[i][j] == '>'){
                            
                                actionTank( i , j , aryOperation[k] );
                                aryOperation[k] = '0';
                              //  continue;
                                break;
                        }
                    }
                }
            }
        }
        return aryBattleArea;
    }
    
    /**
     * ????????????????????????????????????
     * @param i ????????????????????????????????????
     * @param j ????????????????????????????????????
     * @param c ????????????
     */
    public void actionTank( int i , int j , char operation ) {
            
            //???????????????
        if( operation == 'U' ){
            
            aryBattleArea[i][j] = '^';
            
            if( i-1 >= 0 ){
                if( aryBattleArea[i-1][j] == '.' ){
                    aryBattleArea[i][j] = '.';
                    aryBattleArea[i-1][j] = '^';
                }
            }
                
        //???????????????
        }else if( operation == 'D' ){
            
            aryBattleArea[i][j] = 'v';
            
            if( i+1 < aryBattleArea.length ){
                if( aryBattleArea[i+1][j] == '.' ){
                    aryBattleArea[i][j] = '.';
                    aryBattleArea[i+1][j] = 'v';
                }
            }
            
        //???????????????
        }else if( operation == 'L' ){
            
            aryBattleArea[i][j] = '<';
            
            if( j-1 >= 0 ){
                if( aryBattleArea[i][j-1] == '.' ){
                    aryBattleArea[i][j] = '.';
                    aryBattleArea[i][j-1] = '<';
                }
            }
            
        //???????????????
        }else if( operation == 'R' ){
            
            aryBattleArea[i][j] = '>';
            
            if( j+1 < aryBattleArea[i].length ){
                if( aryBattleArea[i][j+1] == '.' ){
                    aryBattleArea[i][j] = '.';
                    aryBattleArea[i][j+1] = '>';
                }
            }
            
            
        //??????????°?  
        }else if( operation == 'S' ){
        
            if(aryBattleArea[i][j] == '^'){
                
                for( int x = i ; x >= 0 ; x-- ){
                    
                    if( aryBattleArea[x][j] == '*' ){
                        aryBattleArea[x][j] = '.';
                        break;
                    }else if( aryBattleArea[x][j] == '#' ){
                        //break;
                    }
                }
                
            }else if(aryBattleArea[i][j] == 'v'){
                
                for( int x = i ; x < aryBattleArea.length ; x++ ){
                    
                    if( aryBattleArea[x][j] == '*' ){
                        aryBattleArea[x][j] = '.';
                        break;
                    }else if( aryBattleArea[x][j] == '#' ){
                        //break;
                    }
                }
                
            }else if(aryBattleArea[i][j] == '<'){
                
                for( int x = j ; x >= 0 ; x-- ){
                    
                    if( aryBattleArea[i][x] == '*' ){
                        aryBattleArea[i][x] = '.';
                        break;
                    }else if( aryBattleArea[x][j] == '#' ){
                        //break;
                    }
                }
                
            }else if(aryBattleArea[i][j] == '>'){
                
                for( int x = j ; x < aryBattleArea.length ; x++ ){
                    
                    if( aryBattleArea[i][x] == '*' ){
                        aryBattleArea[i][x] = '.';
                        break;
                    }else if( aryBattleArea[x][j] == '#' ){
                        //break;
                    }
                }
            }
        }
    }
}