import java.io.*;

public class Rummy {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		String setTotalStr = input.readLine();
		
		int setTotal = Integer.parseInt(setTotalStr);
		
		int cardTotal = 9;
		
		String[][] cardInfoNumStr = new String[setTotal][9];
		
		int[][] cardInfoNum = new int[setTotal][cardTotal];
		
		String[][] cardInfoCol = new String[setTotal][9];
		
		//データをキーボードで入力し、配列に代入する
		for(int set = 0; set < setTotal; set++)
		{
			cardInfoNumStr[set] = input.readLine().split(" ");
			
			for(int num = 0; num < cardTotal; num++)
				cardInfoNum[set][num] = Integer.parseInt(cardInfoNumStr[set][num]);
			
			cardInfoCol[set] = input.readLine().split(" ");
		}
		
		int win = 0;
		
		//勝利条件を満たしているかどうかをset回行う
		for(int set = 0; set < setTotal; set++, win = 0)
		{	
			//1セット目を見つける
			for(int num2nd = 1; (num2nd < cardTotal - 1) &&  (win == 0); num2nd++)
			{
				for(int num3rd = 2; (num3rd < cardTotal) && (win == 0); num3rd++)
				{
					if(((cardInfoNum[set][0] == cardInfoNum[set][num2nd] && cardInfoNum[set][0] == cardInfoNum[set][num3rd])
							 && (cardInfoCol[set][0].equals(cardInfoCol[set][num2nd]) && cardInfoCol[set][0].equals(cardInfoCol[set][num3rd])))
							 || ((cardInfoNum[set][0] == cardInfoNum[set][num2nd] + 1 && cardInfoNum[set][0] == cardInfoNum[set][num3rd] + 2)
									 && (cardInfoCol[set][0].equals(cardInfoCol[set][num2nd]) && cardInfoCol[set][0].equals(cardInfoCol[set][num3rd])))
									 || ((cardInfoNum[set][0] == cardInfoNum[set][num2nd] + 2 && cardInfoNum[set][0] == cardInfoNum[set][num3rd] + 1)
												 && (cardInfoCol[set][0].equals(cardInfoCol[set][num2nd]) && cardInfoCol[set][0].equals(cardInfoCol[set][num3rd])))
												 || ((cardInfoNum[set][0] == cardInfoNum[set][num2nd] - 1 && cardInfoNum[set][0] == cardInfoNum[set][num3rd] + 1)
														 && (cardInfoCol[set][0].equals(cardInfoCol[set][num2nd]) && cardInfoCol[set][0].equals(cardInfoCol[set][num3rd])))
														 || ((cardInfoNum[set][0] == cardInfoNum[set][num2nd] + 1 && cardInfoNum[set][0] == cardInfoNum[set][num3rd] - 1)
																	 && (cardInfoCol[set][0].equals(cardInfoCol[set][num2nd]) && cardInfoCol[set][0].equals(cardInfoCol[set][num3rd])))
																	 || ((cardInfoNum[set][0] == cardInfoNum[set][num2nd] - 2 && cardInfoNum[set][0] == cardInfoNum[set][num3rd] - 1)
																			 && (cardInfoCol[set][0].equals(cardInfoCol[set][num2nd]) && cardInfoCol[set][0].equals(cardInfoCol[set][num3rd])))
																			 || ((cardInfoNum[set][0] == cardInfoNum[set][num2nd] - 1 && cardInfoNum[set][0] == cardInfoNum[set][num3rd] - 2)
																						 && (cardInfoCol[set][0].equals(cardInfoCol[set][num2nd]) && cardInfoCol[set][0].equals(cardInfoCol[set][num3rd]))))
					{
						int cardTotal2nd = cardTotal -3;
						
						int[] cardInfoNum2nd = new int[cardTotal2nd];
						
						String[] cardInfoCol2nd = new String[cardTotal2nd];
						
						int insertNum = 0;
						
						//2セット目を見つける準備
						for(int num = 1; num < cardTotal; num++)
						{
							if(!(num == num2nd || num == num3rd))
							{
								cardInfoNum2nd[insertNum] = cardInfoNum[set][num];
								
								cardInfoCol2nd[insertNum] = cardInfoCol[set][num];
								
								insertNum++;
							}
						}
						
						//2セット目を見つける
						for(int num2set2nd = 1; (num2set2nd < cardTotal2nd - 1) && (win == 0); num2set2nd++)
						{
							for(int num2set3rd = 2; (num2set3rd < cardTotal2nd) && (win == 0); num2set3rd++)
							{
								if(((cardInfoNum2nd[0] == cardInfoNum2nd[num2set2nd] && cardInfoNum2nd[0] == cardInfoNum2nd[num2set3rd])
										 && (cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set2nd]) && cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set3rd])))
										 || ((cardInfoNum2nd[0] == cardInfoNum2nd[num2set2nd] + 1 && cardInfoNum2nd[0] == cardInfoNum2nd[num2set3rd] + 2)
												 && (cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set2nd]) && cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set3rd])))
												 || ((cardInfoNum2nd[0] == cardInfoNum2nd[num2set2nd] + 2 && cardInfoNum2nd[0] == cardInfoNum2nd[num2set3rd] + 1)
															 && (cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set2nd]) && cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set3rd])))
															 || ((cardInfoNum2nd[0] == cardInfoNum2nd[num2set2nd] - 1 && cardInfoNum2nd[0] == cardInfoNum2nd[num2set3rd] + 1)
																	 && (cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set2nd]) && cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set3rd])))
																	 || ((cardInfoNum2nd[0] == cardInfoNum2nd[num2set2nd] + 1 && cardInfoNum2nd[0] == cardInfoNum2nd[num2set3rd] - 1)
																				 && (cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set2nd]) && cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set3rd])))
																				 || ((cardInfoNum2nd[0] == cardInfoNum2nd[num2set2nd] - 2 && cardInfoNum2nd[0] == cardInfoNum2nd[num2set3rd] - 1)
																						 && (cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set2nd]) && cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set3rd])))
																						 || ((cardInfoNum2nd[0] == cardInfoNum2nd[num2set2nd] - 1 && cardInfoNum2nd[0] == cardInfoNum2nd[num2set3rd] - 2)
																									 && (cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set2nd]) && cardInfoCol2nd[0].equals(cardInfoCol2nd[num2set3rd]))))
								{
									int cardTotal3rd = cardTotal2nd -3;
									
									int[] cardInfoNum3rd = new int[cardTotal3rd];
									
									String[] cardInfoCol3rd = new String[cardTotal3rd];
									
									insertNum = 0;
									
									//3セット目を見つける準備
									for(int num = 1; num < cardTotal2nd; num++)
									{
										if(!(num == num2set2nd || num == num2set3rd))
										{
											cardInfoNum3rd[insertNum] = cardInfoNum2nd[num];
											
											cardInfoCol3rd[insertNum] = cardInfoCol2nd[num];
											
											insertNum++;
										}
									}
									
									//勝利条件を満たしているか確かめる
									if(((cardInfoNum3rd[0] == cardInfoNum3rd[1] && cardInfoNum3rd[0] == cardInfoNum3rd[2])
											 && (cardInfoCol3rd[0].equals(cardInfoCol3rd[1]) && cardInfoCol3rd[0].equals(cardInfoCol3rd[2])))
											 || ((cardInfoNum3rd[0] == cardInfoNum3rd[1] + 1 && cardInfoNum3rd[0] == cardInfoNum3rd[2] + 2)
													 && (cardInfoCol3rd[0].equals(cardInfoCol3rd[1]) && cardInfoCol3rd[0].equals(cardInfoCol3rd[2])))
													 || ((cardInfoNum3rd[0] == cardInfoNum3rd[1] + 2 && cardInfoNum3rd[0] == cardInfoNum3rd[2] + 1)
																 && (cardInfoCol3rd[0].equals(cardInfoCol3rd[1]) && cardInfoCol3rd[0].equals(cardInfoCol3rd[2])))
																 || ((cardInfoNum3rd[0] == cardInfoNum3rd[1] - 1 && cardInfoNum3rd[0] == cardInfoNum3rd[2] + 1)
																		 && (cardInfoCol3rd[0].equals(cardInfoCol3rd[1]) && cardInfoCol3rd[0].equals(cardInfoCol3rd[2])))
																		 || ((cardInfoNum3rd[0] == cardInfoNum3rd[1] + 1 && cardInfoNum3rd[0] == cardInfoNum3rd[2] - 1)
																					 && (cardInfoCol3rd[0].equals(cardInfoCol3rd[1]) && cardInfoCol3rd[0].equals(cardInfoCol3rd[2])))
																					 || ((cardInfoNum3rd[0] == cardInfoNum3rd[1] - 2 && cardInfoNum3rd[0] == cardInfoNum3rd[2] - 1)
																							 && (cardInfoCol3rd[0].equals(cardInfoCol3rd[1]) && cardInfoCol3rd[0].equals(cardInfoCol3rd[2])))
																							 || ((cardInfoNum3rd[0] == cardInfoNum3rd[1] - 1 && cardInfoNum3rd[0] == cardInfoNum3rd[2] - 2)
																										 && (cardInfoCol3rd[0].equals(cardInfoCol3rd[1]) && cardInfoCol3rd[0].equals(cardInfoCol3rd[2]))))
									{
										win = 1;
									}
									
								}
							}
						}
					}
				}
			}
			System.out.println(win);
		}
	}
}


//かかった時間：6時間程
