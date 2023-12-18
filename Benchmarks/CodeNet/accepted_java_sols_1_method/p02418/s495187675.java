import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            String ringStr = kb.readLine();    // リング状の文字列
            String targetStr = kb.readLine();  // 対象の文字列

            int ringStrLen = ringStr.length();     // リング状の文字列の長さ
            int targetStrLen = targetStr.length(); // 対象の文字列の長さ
            int j = 0;
            for( int i = 0; i < ringStrLen; i++ ) {
                if( targetStr.charAt( 0 ) == ringStr.charAt( i ) ) {
                	// リング状の文字列における対象の文字列のインデックス用
                    int ij = i;
                    for( j = 0; j < targetStrLen; j++ ) {
                    	// リング状の文字列のインデックスを超えないように剰余演算
                        ij = ( i+j ) % ringStrLen;
                        // 文字が一致しない場合、リング状の文字列の次の文字に進めるため処理を抜ける
                        if( targetStr.charAt( j ) != ringStr.charAt( ij ) ) {
                            break;
                        }
                    }
                }
                // 対象の文字列が見つかった場合、処理を抜ける
                if( targetStrLen == j ) { break; }
            }

            // 対象の文字列が見つかった場合、j = 0 にリセットされないので、
            if( targetStrLen == j ) {
                System.out.println( "Yes" );            
            } else {
                System.out.println( "No" );
            }
        } catch( IOException e ) {
            System.err.println( e );
        }

	}

}

