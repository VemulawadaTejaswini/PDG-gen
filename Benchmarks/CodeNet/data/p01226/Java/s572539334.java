import java.util.Scanner;

public class Main {

	static void move_up ( char[][] map, int[] tank_pos ) {

		if ( map[tank_pos[1]-1][tank_pos[0]] == '.' ) {
			map[tank_pos[1]][tank_pos[0]] = '.';
			map[tank_pos[1]-1][tank_pos[0]] = '^';
			tank_pos[1]--;
		}else {
			map[tank_pos[1]][tank_pos[0]] = '^';
		}
	}

	static void move_down ( char[][] map, int[] tank_pos ) {

		if ( map[tank_pos[1]+1][tank_pos[0]] == '.' ) {
			map[tank_pos[1]][tank_pos[0]] = '.';
			map[tank_pos[1]+1][tank_pos[0]] = 'v';
			tank_pos[1]++;
		}else {
			map[tank_pos[1]][tank_pos[0]] = 'v';
		}
	}

	static void move_left ( char[][] map, int[] tank_pos ) {

		if ( map[tank_pos[1]][tank_pos[0]-1] == '.' ) {
			map[tank_pos[1]][tank_pos[0]] = '.';
			map[tank_pos[1]][tank_pos[0]-1] = '<';
			tank_pos[0]--;
		}else {
			map[tank_pos[1]][tank_pos[0]] = '<';
		}
	}

	static void move_right ( char[][] map, int[] tank_pos ) {

		if ( map[tank_pos[1]][tank_pos[0]+1] == '.' ) {
			map[tank_pos[1]][tank_pos[0]] = '.';
			map[tank_pos[1]][tank_pos[0]+1] = '>';
			tank_pos[0]++;
		}else {
			map[tank_pos[1]][tank_pos[0]] = '>';
		}
	}

	static void shoot ( char[][] map, int tank_x, int tank_y ) {

		int missile_x = tank_x;
		int missile_y = tank_y;

		while ( true ) {
			if ( map[tank_y][tank_x] == '^' ) {
				missile_y--;
			} else if ( map[tank_y][tank_x] == 'v' ) {
				missile_y++;
			} else if ( map[tank_y][tank_x] == '<' ) {
				missile_x--;
			} else if ( map[tank_y][tank_x] == '>' ) {
				missile_x++;
			}

			if ( map[missile_y][missile_x] == '*' ) {
				map[missile_y][missile_x] = '.';
				break;
			} else if( map[missile_y][missile_x] == '#' ) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		//データセット数
		int set_num_T;

		int map_H = 0;
		int map_W = 0;
		int input_op_length_N = 0;
		int[] tank_pos = new int[]{ 0, 0 };
		String str_buf = "";
		String str_op = "";
		char[][] map;
		char[] tank = new char[]{'^','>','v','<'};

		Scanner sc= new Scanner( System.in );

		set_num_T = sc.nextInt();

		for( int i = 0; i < set_num_T ; i++ ) {

			//データ読み込み
			map_H = sc.nextInt();
			map_W = sc.nextInt();

			map = new char[map_H+2][map_W+2];

			//mapセット mapを#で囲む
			for ( int j = 0 ; j < map.length ; j++ ) {
				for ( int k = 0 ; k < map[j].length ; k++ ) {
					if ( ( ( j+1 ) % ( map.length-1 ) ) == 1 || ( ( k+1 ) % ( map[i].length-1 ) ) == 1 ) {
						map[j][k] = '#';
					} else {
						if ( k== 1 ) {
							str_buf =sc.next();
						}
						map[j][k]=str_buf.charAt( k-1 );

						//読み込みデータが戦車の時、戦車の位置を取得
						for( int l = 0 ; l < 4 ; l++ ) {
							if ( map[j][k] == tank[l] ) {
								tank_pos[0] = k;
								tank_pos[1] = j;
							}
						}
					}
				}
			}

			input_op_length_N = sc.nextInt();
			str_op = sc.next();


			//命令に従ってMAPと戦車を書き換える
			for ( int j = 0 ; j < input_op_length_N; j++) {
				switch( str_op.charAt(j) ) {
				case 'U':
					move_up( map, tank_pos );
					break;
				case 'D':
					move_down( map, tank_pos );
					break;
				case 'L':
					move_left( map, tank_pos );
					break;
				case 'R':
					move_right( map, tank_pos );
					break;
				case 'S':
					shoot( map, tank_pos[0], tank_pos[1] );
					break;
				}

			}

			//結果処理
			for ( int j = 1 ; j < map_H+1 ; j++ ) {
				for ( int k = 1 ; k < map_W+1 ; k++ ) {
					System.out.print( map[j][k] );
				}
				System.out.print( "\n" );
			}

			if(i != set_num_T-1) {
				System.out.print( "\n" );
			}
		}
		sc.close();
	}
}

